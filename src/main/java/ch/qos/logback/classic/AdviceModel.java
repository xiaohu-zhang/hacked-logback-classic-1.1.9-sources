package ch.qos.logback.classic;
public class AdviceModel {
    
    
    private String msg;
    private String FQCN;
    private Level level;
    private Throwable throwable;
    
    
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getFQCN() {
        return FQCN;
    }
    public void setFQCN(String fQCN) {
        FQCN = fQCN;
    }
    public Level getLevel() {
        return level;
    }
    public void setLevel(Level level) {
        this.level = level;
    }
    public Throwable getThrowable() {
        return throwable;
    }
    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
    
    
}
