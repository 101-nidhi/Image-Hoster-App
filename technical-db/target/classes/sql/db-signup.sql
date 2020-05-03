-- Create a schema "imagehoster" in database "postgres"
CREATE SCHEMA IF NOT EXISTS imagehoster;

DROP TABLE IF EXISTS imagehoster.USERS CASCADE;

CREATE TABLE IF NOT EXISTS imagehoster.USERS(
	ID SERIAL PRIMARY KEY,
    UUID VARCHAR(36) NOT NULL,
    ROLE VARCHAR(36),
    EMAIL VARCHAR(200) NOT NULL,
    PASSWORD VARCHAR(200) NOT NULL,
    SALT VARCHAR(200) NOT NULL,
    FIRST_NAME VARCHAR(50) NOT NULL,
    LAST_NAME VARCHAR(50) NOT NULL,
    MOBILE_PHONE VARCHAR(50) NOT NULL,
    LAST_LOGIN_AT TIMESTAMP NULL
--	ID SERIAL PRIMARY KEY,
--    UUID VARCHAR(36) NOT NULL,
--    VERSION SERIAL NOT NULL,
--    ROLE_ID INTEGER,
--    EMAIL VARCHAR(200) NOT NULL,
--    PASSWORD VARCHAR(200) NOT NULL,
--    SALT VARCHAR(200) NOT NULL,
--    FIRST_NAME VARCHAR(50) NOT NULL,
--    LAST_NAME VARCHAR(50) NOT NULL,
--    MOBILE_PHONE VARCHAR(50) NULL,
--    STATUS SMALLINT NOT NULL,
--    FAILED_LOGIN_COUNT SMALLINT,
--    LAST_PASSWORD_CHANGE_AT TIMESTAMP,
--    LAST_LOGIN_AT TIMESTAMP NULL,
--    CREATED_BY VARCHAR(100) NOT NULL ,
--    CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--    MODIFIED_BY VARCHAR(100) NULL,
--    MODIFIED_AT TIMESTAMP NULL
);
--COMMENT ON TABLE imagehoster.USERS IS 'Table to capture users';
--COMMENT ON COLUMN imagehoster.USERS.ID IS 'Auto generated PK identifier';
--COMMENT ON COLUMN imagehoster.USERS.UUID IS 'Unique identifier used as reference by external systems';
--COMMENT ON COLUMN imagehoster.USERS.VERSION IS 'Versioning for optimistic locking';
--COMMENT ON COLUMN imagehoster.USERS.ROLE_ID IS 'Role that this user is mapped to';
--COMMENT ON COLUMN imagehoster.USERS.EMAIL IS 'Email address of the user';
--COMMENT ON COLUMN imagehoster.USERS.PASSWORD IS 'Encrypted password of the user';
--COMMENT ON COLUMN imagehoster.USERS.SALT IS 'Generated salt for strong encryption of password of user';
--COMMENT ON COLUMN imagehoster.USERS.FIRST_NAME IS 'First name of the user';
--COMMENT ON COLUMN imagehoster.USERS.LAST_NAME IS 'Last name of the user';
--COMMENT ON COLUMN imagehoster.USERS.MOBILE_PHONE IS 'Mobile phone coordinates of the user';
--COMMENT ON COLUMN imagehoster.USERS.STATUS IS 'Status of the user - INACTIVE(0), ACTIVE (1), LOCKED(2)';
--COMMENT ON COLUMN imagehoster.USERS.FAILED_LOGIN_COUNT IS 'Count to keep track of failed login attempts by the user';
--COMMENT ON COLUMN imagehoster.USERS.LAST_PASSWORD_CHANGE_AT IS 'Point in time when the user modified the password - as per password policy';
--COMMENT ON COLUMN imagehoster.USERS.LAST_LOGIN_AT IS 'Point in time when the user log in';
--COMMENT ON COLUMN imagehoster.USERS.CREATED_BY IS 'User who inserted this record';
--COMMENT ON COLUMN imagehoster.USERS.CREATED_AT IS 'Point in time when this record was inserted';
--COMMENT ON COLUMN imagehoster.USERS.MODIFIED_BY IS 'User who modified this record';
--COMMENT ON COLUMN imagehoster.USERS.MODIFIED_AT IS 'Point in time when this record was modified';
ALTER TABLE imagehoster.USERS ADD CONSTRAINT UK_USERS_EMAIL UNIQUE(EMAIL);
----ALTER TABLE imagehoster.USERS ADD CONSTRAINT FK_USERS_ROLE_ID FOREIGN KEY(ROLE_ID) REFERENCES imagehoster.ROLES(ID);
--DROP TABLE IF EXISTS imagehoster.USER_AUTH_TOKENS CASCADE;
--CREATE TABLE imagehoster.USER_AUTH_TOKENS(
--	ID BIGSERIAL PRIMARY KEY,
--	VERSION SERIAL NOT NULL,
--	USER_ID INTEGER NOT NULL,
--	ACCESS_TOKEN VARCHAR(500) NOT NULL,
--	EXPIRES_AT TIMESTAMP NOT NULL,
--	LOGIN_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--	LOGOUT_AT TIMESTAMP,
--	CREATED_BY VARCHAR(100) NOT NULL,
--	CREATED_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
--	MODIFIED_BY VARCHAR(100),
--	MODIFIED_AT TIMESTAMP
--);
--COMMENT ON TABLE imagehoster.USER_AUTH_TOKENS IS 'Table to capture user authentication tokens';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.ID IS 'Auto generated PK identifier';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.VERSION IS 'Versioning for optimistic locking';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.USER_ID IS 'User whose authentication token is generated';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.ACCESS_TOKEN IS 'Generated authentication token (short-lived) for the logged-in user';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.EXPIRES_AT IS 'Expiration time of the generated authentication token';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.LOGIN_AT IS 'Login time of the logged-in user';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.LOGOUT_AT IS 'Logout time of the previously logged-in user';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.CREATED_BY IS 'User who inserted this record';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.CREATED_AT IS 'Point in time when this record was inserted';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.MODIFIED_BY IS 'User who modified this record';
--COMMENT ON COLUMN imagehoster.USER_AUTH_TOKENS.MODIFIED_AT IS 'Point in time when this record was modified';
--
--
--ALTER TABLE imagehoster.USER_AUTH_TOKENS ADD CONSTRAINT UK_USER_AUTH_TOKENS_ACCESS_TOKEN UNIQUE(ACCESS_TOKEN);
--ALTER TABLE imagehoster.USER_AUTH_TOKENS ADD CONSTRAINT FK_USER_AUTH_TOKENS_USER_ID FOREIGN KEY(USER_ID) REFERENCES imagehoster.USERS(ID);
--
--COMMIT;
--
