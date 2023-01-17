public class Messages {
    private String UserID;
    private String UserName;
    private String WhatYouposts;

    public String getUserID(){return UserID;}
    public void setUserID(String UserID){this.UserID=UserID;}
    public String getUserName(){return UserName;}

    public void setUserName(String Username){this.UserName=Username;}
    public String getWhatYouposts(){return whatYouposts()}
    public void setWhatYouposts(String whatYouposts){
        WhatYouposts=whatYouposts;
    }
    public Messages(){
    }
    public Messages(String UserID, String userName, String whatYouposts){
        this.UserID = UserID;
        this.UserName = userName;
        WhatYouposts = whatYouposts;
    }
}
