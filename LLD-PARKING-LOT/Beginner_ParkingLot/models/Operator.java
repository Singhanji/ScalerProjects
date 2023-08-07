package Beginner_ParkingLot.models;

public class Operator extends BaseModel{
    private String name;
    private String username;
    private String pwd;
    // may have shift start, and shift end information also

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
