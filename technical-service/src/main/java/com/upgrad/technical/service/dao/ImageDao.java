package com.upgrad.technical.service.dao;

import com.upgrad.technical.service.entity.ImageEntity;
import com.upgrad.technical.service.entity.UserAuthTokenEntity;
import com.upgrad.technical.service.entity.UserEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

@Repository
public class ImageDao {

    @PersistenceContext
    private EntityManager entityManager;

    public ImageEntity createImage(ImageEntity imageEntity) {
        entityManager.persist(imageEntity);
        return imageEntity;
    }

    public UserAuthTokenEntity getUserAuthToken(final String accessToken) {
        try{
            return entityManager.createNamedQuery("userAuthTokenByAccessToken", UserAuthTokenEntity.class).setParameter("accessToken",accessToken).getSingleResult();
        }catch(NoResultException nre){
            return null;
        }
    }
    //added new
    public UserAuthTokenEntity createAuthToken(final UserAuthTokenEntity userAuthTokenEntity) {
        entityManager.persist(userAuthTokenEntity);
        return userAuthTokenEntity;
    }

      //
      public ImageEntity getImage(final String imageUuid) {
          try{
              return entityManager.createNamedQuery("userImage",ImageEntity.class).setParameter("uuid",imageUuid).getSingleResult();
          }catch(NoResultException nre){
              return null;
          }
      }


    public ImageEntity getImageById(final long Id) {
        try{
            return entityManager.createNamedQuery("userImageById",ImageEntity.class).setParameter("Id",Id).getSingleResult();
        }catch(NoResultException nre){
            return null;
        }
    }

    public ImageEntity updateImage(final ImageEntity imageEntity) {
        entityManager.persist(imageEntity);
        return imageEntity;
    }
}