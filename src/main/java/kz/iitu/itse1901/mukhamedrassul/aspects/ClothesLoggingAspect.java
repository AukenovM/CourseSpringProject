package kz.iitu.itse1901.mukhamedrassul.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ClothesLoggingAspect {
    @Before("kz.iitu.itse1901.mukhamedrassul.aspects.MyPointcut.GetClothes()")
    public void beforeGetClothesAdvice() {
        System.out.println("beforeGetClothesAdvice: попытка взятия листа Clothes");

        System.out.println("_____________________");
    }

    @After("kz.iitu.itse1901.mukhamedrassul.aspects.MyPointcut.GetClothes()")
    public void afterGetClothesAdvice() {
        System.out.println("AfterGetClothesAdvice: логируем нормальное " +
                "окончание работы метода или выброс исключения");

        System.out.println("_____________________");
    }
}
