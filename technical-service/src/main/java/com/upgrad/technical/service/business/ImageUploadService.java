package com.upgrad.technical.service.business;

import com.upgrad.technical.service.dao.ImageDao;
import com.upgrad.technical.service.entity.ImageEntity;
//import com.upgrad.technical.service.entity.RoleEntity;
import com.upgrad.technical.service.entity.UserAuthTokenEntity;
import com.upgrad.technical.service.entity.UserEntity;
import com.upgrad.technical.service.exception.ImageNotFoundException;
import com.upgrad.technical.service.exception.UnauthorizedException;
import com.upgrad.technical.service.exception.UploadFailedException;
import com.upgrad.technical.service.exception.UserNotSignedInException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImageUploadService {

    @Autowired
    private ImageDao imageDao;

    @Transactional(propagation = Propagation.REQUIRED)
    public ImageEntity upload(ImageEntity imageEntity,final String authorizationToken) throws UploadFailedException {
          UserAuthTokenEntity userAuthTokenEntity = this.imageDao.getUserAuthToken(authorizationToken);
        if (userAuthTokenEntity == null) {
            throw new UploadFailedException("UP-001", "User is not Signed in, sign in first to upload an image");
        }


        //imageEntity.setUser_id(userAuthTokenEntity.getUser());
        imageEntity.setUser_id(userAuthTokenEntity.getUser());
        return imageDao.createImage(imageEntity);
    }
//    public RoleEntity getImage(final String imageUuid, final String authorization) throws ImageNotFoundException, UnauthorizedException, UserNotSignedInException {
//
//        UserAuthTokenEntity userAuthTokenEntity = imageDao.getUserAuthToken(authorization);
//
//        RoleEntity role = userAuthTokenEntity.getUser().getRole();
//        if (role == null) {
//            throw new ImageNotFoundException("USR-001", "User not found");
//        }
//        return role;
//    }
}
