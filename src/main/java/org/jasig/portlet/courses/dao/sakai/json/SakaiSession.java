package org.jasig.portlet.courses.dao.sakai.json;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SakaiSession implements Serializable {

    private Map<String,String> attributeNames;
    private List<String> attributes;
    private long creationTime;
    private long currentTime;
    private String id;
    private long lastAccessedTime;
    private int maxInactiveInterval;
    private String userEid;
    private String userId;
    private boolean active;
    private String entityReference;
    private String entityURL;
    private String entityId;


    public Map<String, String> getAttributeNames() {
        return attributeNames;
    }

    public void setAttributeNames(Map<String, String> attributeNames) {
        this.attributeNames = attributeNames;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getLastAccessedTime() {
        return lastAccessedTime;
    }

    public void setLastAccessedTime(long lastAccessedTime) {
        this.lastAccessedTime = lastAccessedTime;
    }

    public int getMaxInactiveInterval() {
        return maxInactiveInterval;
    }

    public void setMaxInactiveInterval(int maxInactiveInterval) {
        this.maxInactiveInterval = maxInactiveInterval;
    }

    public String getUserEid() {
        return userEid;
    }

    public void setUserEid(String userEid) {
        this.userEid = userEid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEntityReference() {
        return entityReference;
    }

    public void setEntityReference(String entityReference) {
        this.entityReference = entityReference;
    }

    public String getEntityURL() {
        return entityURL;
    }

    public void setEntityURL(String entityURL) {
        this.entityURL = entityURL;
    }

    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }
    
    public String toString() {
        return (new ToStringBuilder(this)).append(this.id).append(this.userId).toString();
    }

}
