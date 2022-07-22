package com.service.summonerinfo;

import com.dao.summonerinfo.SummonerInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.model.SummonerInfo;
import com.service.accountinfo.AccountInfoService;
import com.types.PlatformEnum;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Component
public class SummonerInfoServiceImpl implements SummonerInfoService {

    private static final Logger LOGGER = LogManager.getLogger(SummonerInfoServiceImpl.class);


    @Autowired
    private SummonerInfoDAO summonerInfoDAO;

    @Autowired
    private AccountInfoService accountInfoService;

    public SummonerInfo getSummonerDetails(String name, String region) throws JsonProcessingException {
        if(PlatformEnum.isInEnumByName(region)) {
            SummonerInfo si = summonerInfoDAO.getSummonerDetails(name, region);
            LOGGER.info("GET Summoner Details: Summoner found with Name: " + name);
            try {
                AccountInfo ai = accountInfoService.getAccountDetails(si.getPuuid(), PlatformEnum.getRegionCodeByName(region));
                if (ai != null) {
                    si.setGameName(ai.getGameName());
                    si.setTagLine(ai.getTagLine());
                }
            }catch(Exception e){
                LOGGER.error("GET Summoner Details: Error finding Riot Account Info related to name: " + name);
            }
            return si;
        }else{
            LOGGER.info("GET Summoner Details: Invalid Platform Code: " + region);
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }


}
