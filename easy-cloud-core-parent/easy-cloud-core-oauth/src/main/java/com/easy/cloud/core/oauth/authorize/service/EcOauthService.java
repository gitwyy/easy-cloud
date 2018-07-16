package com.easy.cloud.core.oauth.authorize.service;

import com.easy.cloud.core.oauth.authorize.base.pojo.dto.EcBaseAccessTokenDTO;

/**
 * @author daiqi
 * @create 2018-06-29 17:37
 */
public interface EcOauthService {

    EcBaseAccessTokenDTO getAccessToken(Integer accessTokenChannel);

    void saveAccessToken(Integer accessTokenChannel, EcBaseAccessTokenDTO accessTokenDTO);
}
