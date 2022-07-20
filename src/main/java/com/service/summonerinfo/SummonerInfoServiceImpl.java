package com.service.summonerinfo;

import com.dao.summonerinfo.SummonerInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.model.SummonerInfo;
import com.service.accountinfo.AccountInfoService;
import com.types.PlatformEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Component
public class SummonerInfoServiceImpl implements SummonerInfoService {

    @Autowired
    private SummonerInfoDAO summonerInfoDAO;

    @Autowired
    private AccountInfoService accountInfoService;

    public SummonerInfo getSummonerDetails(String name, String region) throws JsonProcessingException {
        try {
            if(PlatformEnum.isInEnumByName(region)) {
                SummonerInfo si = summonerInfoDAO.getSummonerDetails(name, region);
                AccountInfo ai = accountInfoService.getAccountDetails(si.getPuuid(), PlatformEnum.getRegionCodeByName(region));
                if(ai!=null) {
                    si.setGameName(ai.getGameName());
                    si.setTagLine(ai.getTagLine());
                }
                return si;
            }else{
                return null;
            }
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }


}
