package com.service;

import com.dao.SummonerInfoDAO;
import com.exception.ApiRequestException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;
import com.model.SummonerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@Component
public class SummonerInfoServiceImpl implements SummonerInfoService {

    @Autowired
    private SummonerInfoDAO accountInfoDAO;

    @Autowired
    private AccountInfoService accountInfoService;

    public SummonerInfo summonerDetails(String name) throws JsonProcessingException {
        try {
            SummonerInfo si = accountInfoDAO.summonerDetails(name);
            AccountInfo ai = accountInfoService.accountValue(si.getPuuid());
            si.setGameName(ai.getGameName());
            si.setTagLine(ai.getTagLine());
            return si;
        } catch (HttpClientErrorException.NotFound e) {
            throw new ApiRequestException();
        }
    }
}
