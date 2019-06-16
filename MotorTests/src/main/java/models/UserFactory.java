package models;

public class UserFactory {
    public static User createRandom(){
        User user = new User();
        //здесь добавить логику создания пользователя, если нужно
        user.setMail("");
        user.setPassword("");
        return user;
    }
}
