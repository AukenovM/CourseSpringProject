package kz.iitu.itse1901.mukhamedrassul.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserLoggingAspect {
    @Before("kz.iitu.itse1901.mukhamedrassul.aspects.MyPointcut.getUsers()")
    public void beforeGetUsersAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        System.out.println("methodSignature = "
                + methodSignature);
        System.out.println("methodSignature.getMethod() = "
                + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = "
                + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = "
                + methodSignature.getName());

        System.out.println("beforeGetUsersAdvice: " +
                "попытка взятия листа Users ");
    }

    @AfterThrowing(pointcut = "kz.iitu.itse1901.mukhamedrassul.aspects.MyPointcut.addNewUser()", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {

        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем выброс " +
                "исключения " + exception);

        System.out.println("_____________________");
    }

    @Around("kz.iitu.itse1901.mukhamedrassul.aspects.MyPointcut.addNewUser()")
    public Object aroundAddUserAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundAddUserAdvice: в библиотеку " +
                "пытаются вернуть книгу");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            throw e;
        }


        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку " +
                "успешно вернули книгу");

        return targetMethodResult;
    }
}
