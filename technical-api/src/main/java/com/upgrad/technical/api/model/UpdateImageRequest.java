package com.upgrad.technical.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SignupUserRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-24T13:07:56.222+05:30")

public class UpdateImageRequest   {
//    @JsonProperty("first_name")
//    private String firstName = null;

//    @JsonProperty("last_name")
//    private String lastName = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("image")
    private String image = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("status")
    private String status = null;


//    @JsonProperty("email_address")
//    private String emailAddress = null;
//
//    @JsonProperty("password")
//    private String password = null;
//
//    @JsonProperty("mobile_number")
//    private String mobileNumber = null;

    public UpdateImageRequest  name(String firstName) {
        this.name = name;
        return this;
    }

    /**
     * First name of the new user
     * @return firstName
     **/
    @ApiModelProperty(required = true, value = "Name of the new user")
    @NotNull


//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateImageRequest  description(String description) {
        this.description = description;
        return this;
    }

    /**
     * description of the new user
     * @return description
     **/
    @ApiModelProperty(required = true, value = "Description of the new image")
    @NotNull

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description= description;
    }


    public UpdateImageRequest  status(String status) {
        this.status = status;
        return this;
    }

    /**
     * description of the new user
     * @return description
     **/
    @ApiModelProperty(required = true, value = "status of the new image")
    @NotNull

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status= status;
    }


    public UpdateImageRequest  image(String image) {
        this.image = image;
        return this;
    }

    /**
     * image of the new user
     * @return image
     **/
    @ApiModelProperty(required = true, value = "image of the new user")
    @NotNull

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image= image;
    }

//    public ImageUploadRequest lastName(String lastName) {
//        this.lastName = lastName;
//        return this;
//    }

//    /**
//     * Last name of the new user
//     * @return lastName
//     **/
//    @ApiModelProperty(required = true, value = "Last name of the new user")
//    @NotNull


//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public ImageUploadRequest emailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//        return this;
//    }

    /**
     * Email address of the new user
     * @return emailAddress
     **/
//    @ApiModelProperty(required = true, value = "Email address of the new user")
//    @NotNull
//
//
//    public String getEmailAddress() {
//        return emailAddress;
//    }
//
//    public void setEmailAddress(String emailAddress) {
//        this.emailAddress = emailAddress;
//    }
//
//    public ImageUploadRequest password(String password) {
//        this.password = password;
//        return this;
//    }
//
//    /**
//     * Password of the new user
//     * @return password
//     **/
//    @ApiModelProperty(required = true, value = "Password of the new user")
//    @NotNull
//
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public ImageUploadRequest mobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//        return this;
//    }
//
//    /**
//     * Mobile number of the new user
//     * @return mobileNumber
//     **/
//    @ApiModelProperty(required = true, value = "Mobile number of the new user")
//    @NotNull
//
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateImageRequest  UpdateImageRequest  = (UpdateImageRequest ) o;
        return Objects.equals(this.name, UpdateImageRequest .name) &&
                Objects.equals(this.image,UpdateImageRequest .image) &&
                Objects.equals(this.description,UpdateImageRequest.description) ;
//                Objects.equals(this.password,UpdateImageRequest .password) &&
//                Objects.equals(this.mobileNumber,UpdateImageRequest.mobileNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, image, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateImageRequest {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
//        sb.append("    password: ").append(toIndentedString(password)).append("\n");
//        sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}