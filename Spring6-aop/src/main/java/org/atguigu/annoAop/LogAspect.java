package org.atguigu.annoAop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*切面类*/
@Component //放入IOC容器中
@Aspect     //表示这是一个切面类
public class LogAspect {
    /*设置切入点和通知类型*/
    /*通知类型:
    @Before(value = "切入点配置表达式切入点")前置
    切入点表达式execution(权限修饰符(*表示任意) 方法返回值类型 方法所在类型的全类名.方法名(参数列表) )
    @AfterReturning返回
    @AfterThrowing异常
    @After()后置
    @Around()环绕*/

    /*重用切入点表达式*/
    @Pointcut("execution(public int org.atguigu.annoAop.CalculatorImpl.*(int,int))")
    public void pointCut(){}

    @Before(value = "execution(public int org.atguigu.annoAop.CalculatorImpl.*(int,int))")
    public void beforeMethod(){
        System.out.println("Before");
    }
    @AfterReturning(value = "execution(public int org.atguigu.annoAop.CalculatorImpl.*(int,int))",returning = "result")
    public void afterRetruning(JoinPoint joinPoint,Object result){
        System.out.println("AfterReturning");
        System.out.println("方法名:" + joinPoint.getSignature().getName());//获取方法名并输出
        System.out.println("参数" + Arrays.toString(joinPoint.getArgs()));//获取参数并输出
        System.out.println("返回值" + result);//获取返回值并输出
    }
    @AfterThrowing(value = "execution(public int org.atguigu.annoAop.CalculatorImpl.*(int,int))",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Throwable ex){//不能使用Runnable接口进行定义
        System.out.println("AfterThrowing");
        System.out.println(joinPoint.getSignature().getName());//获取方法名并输出
        System.out.println(Arrays.toString(joinPoint.getArgs()));//获取参数并输出
        System.out.println(ex);//获取异常信息并输出
    }

    /*使用重用切入点表达式*/
    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint){
        System.out.println("After");
        System.out.println("方法名:" + joinPoint.getSignature().getName());//获取方法名并输出
        System.out.println("参数" + Arrays.toString(joinPoint.getArgs()));//获取参数并输出
    }
}
