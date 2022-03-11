package kz.iitu.itse1901.mukhamedrassul.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* getClothesSmthg())")
    public void GetClothes() {
    }

    @Pointcut("execution(* getUsersSmthg())")
    public void getUsers() {
    }

    @Pointcut("execution(* addUserNew())")
    public void addNewUser() {
    }
}
