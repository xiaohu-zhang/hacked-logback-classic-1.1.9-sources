package ch.qos.logback.classic;
public interface ILogbackAdvice {
    default AdviceModel before(String localFQCN,String msg,Level level){
        return null;
    }
    default void after(String localFQCN,String msg,Level level){
    }
    default AdviceModel before(String localFQCN,String msg,Level level,Throwable t){
        return null;
    }
    default void after(String localFQCN,String msg,Level level,Throwable t){
    }
}
