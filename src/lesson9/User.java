package lesson9;

import java.util.Objects;
public class User {
    private String userName;
    private String pathToImage;

    public User() {
    }

    public User(String userName, String pathToImage) {
        this.userName = userName;
        this.pathToImage = pathToImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    @Override
    public boolean equals(Object o) {
        // this - первый
        // o - второй -- user

        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;

        User user = (User) o;

        if (!Objects.equals(userName, user.userName))
            return false;
        return Objects.equals(pathToImage, user.pathToImage);
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (pathToImage != null ? pathToImage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", pathToImage='" + pathToImage + '\'' +
                '}';
    }

}
