package cn.rongcloud.im.db;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

import android.text.TextUtils;

/**
 * Entity mapped to table FRIEND.
 */
public class Friend {

    /** Not-null value. */
    private String userId;
    private String name;
    private String portraitUri;
    private String displayName;
    private String status;
    private Long timestamp;

    public Friend() {
    }

    public Friend(String userId) {
        this.userId = userId;
    }

    public Friend(String userId, String name, String portraitUri, String displayName, String status, Long timestamp) {
        this.userId = userId;
        this.name = name;
        this.portraitUri = portraitUri;
        this.displayName = displayName;
        this.status = status;
        this.timestamp = timestamp;
    }

    /** Not-null value. */
    public String getUserId() {
        return userId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPortraitUri() {
        return portraitUri;
    }

    public void setPortraitUri(String portraitUri) {
        this.portraitUri = portraitUri;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isExitsDisplayName() {
        if (TextUtils.isEmpty(getDisplayName())) {
            return false;
        }
        return true;
    }

}
