package com.gst.service;


import com.gst.domain.UserLocation;

import java.util.List;

/**
 * Created by truonghuuthanh on 4/4/17.
 */
public interface LocationService {
    List<UserLocation> findAll();

    UserLocation save(UserLocation userLocation);

    List<UserLocation> findByEmail(String email);
    
}

