/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年6月30日 下午5:41:19  
 *  
 */  

package com.rongji.util.concurrent;


/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年6月30日 下午5:41:19  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月30日      吴有根                      1.0         1.0 Version  
 */


/**
 * 枚举类默认继承了<code>Enum<code>类,所以不能再继承其他的类,Java不支持多继承
 * 而Enum类继承了Object类。
 * 还默认实现了<code>Comparable</code>接口
 * 和<code>Serializable</code>接口,因为Enum类是实现了Comparable、Serializable接口
 * 
 * 采用enum声明后，该类会被编译器加上final声明,故该类是不能被继承的。
 * 枚举类中的枚举值就是该类的实例，且必须在第一行定义，在类被初始化时，这些枚举值会被实例化
 * 
 */
public  enum TimeUnit{

	
	 NANOSECONDS {
	        public long toNanos(long d)   { return d; }
	        public long toMicros(long d)  { return d/(C1/C0); }
	        public long toMillis(long d)  { return d/(C2/C0); }
	        public long toSeconds(long d) { return d/(C3/C0); }
	        public long toMinutes(long d) { return d/(C4/C0); }
	        public long toHours(long d)   { return d/(C5/C0); }
	        public long toDays(long d)    { return d/(C6/C0); }
	        public long convert(long d, TimeUnit u) { return u.toNanos(d); }
	        int excessNanos(long d, long m) { return (int)(d - (m*C2)); }
	    },
	    MICROSECONDS {
	        public long toNanos(long d)   { return x(d, C1/C0, MAX/(C1/C0)); }
	        public long toMicros(long d)  { return d; }
	        public long toMillis(long d)  { return d/(C2/C1); }
	        public long toSeconds(long d) { return d/(C3/C1); }
	        public long toMinutes(long d) { return d/(C4/C1); }
	        public long toHours(long d)   { return d/(C5/C1); }
	        public long toDays(long d)    { return d/(C6/C1); }
	        public long convert(long d, TimeUnit u) { return u.toMicros(d); }
	        int excessNanos(long d, long m) { return (int)((d*C1) - (m*C2)); }
	    },
	    MILLISECONDS {
	        public long toNanos(long d)   { return x(d, C2/C0, MAX/(C2/C0)); }
	        public long toMicros(long d)  { return x(d, C2/C1, MAX/(C2/C1)); }
	        public long toMillis(long d)  { return d; }
	        public long toSeconds(long d) { return d/(C3/C2); }
	        public long toMinutes(long d) { return d/(C4/C2); }
	        public long toHours(long d)   { return d/(C5/C2); }
	        public long toDays(long d)    { return d/(C6/C2); }
	        public long convert(long d, TimeUnit u) { return u.toMillis(d); }
	        int excessNanos(long d, long m) { return 0; }
	    },
	    SECONDS {
	        public long toNanos(long d)   { return x(d, C3/C0, MAX/(C3/C0)); }
	        public long toMicros(long d)  { return x(d, C3/C1, MAX/(C3/C1)); }
	        public long toMillis(long d)  { return x(d, C3/C2, MAX/(C3/C2)); }
	        public long toSeconds(long d) { return d; }
	        public long toMinutes(long d) { return d/(C4/C3); }
	        public long toHours(long d)   { return d/(C5/C3); }
	        public long toDays(long d)    { return d/(C6/C3); }
	        public long convert(long d, TimeUnit u) { return u.toSeconds(d); }
	        int excessNanos(long d, long m) { return 0; }
	    },
	    MINUTES {
	        public long toNanos(long d)   { return x(d, C4/C0, MAX/(C4/C0)); }
	        public long toMicros(long d)  { return x(d, C4/C1, MAX/(C4/C1)); }
	        public long toMillis(long d)  { return x(d, C4/C2, MAX/(C4/C2)); }
	        public long toSeconds(long d) { return x(d, C4/C3, MAX/(C4/C3)); }
	        public long toMinutes(long d) { return d; }
	        public long toHours(long d)   { return d/(C5/C4); }
	        public long toDays(long d)    { return d/(C6/C4); }
	        public long convert(long d, TimeUnit u) { return u.toMinutes(d); }
	        int excessNanos(long d, long m) { return 0; }
	    },
	    HOURS {
	        public long toNanos(long d)   { return x(d, C5/C0, MAX/(C5/C0)); }
	        public long toMicros(long d)  { return x(d, C5/C1, MAX/(C5/C1)); }
	        public long toMillis(long d)  { return x(d, C5/C2, MAX/(C5/C2)); }
	        public long toSeconds(long d) { return x(d, C5/C3, MAX/(C5/C3)); }
	        public long toMinutes(long d) { return x(d, C5/C4, MAX/(C5/C4)); }
	        public long toHours(long d)   { return d; }
	        public long toDays(long d)    { return d/(C6/C5); }
	        public long convert(long d, TimeUnit u) { return u.toHours(d); }
	        int excessNanos(long d, long m) { return 0; }
	    },
	    DAYS {
	        public long toNanos(long d)   { return x(d, C6/C0, MAX/(C6/C0)); }
	        public long toMicros(long d)  { return x(d, C6/C1, MAX/(C6/C1)); }
	        public long toMillis(long d)  { return x(d, C6/C2, MAX/(C6/C2)); }
	        public long toSeconds(long d) { return x(d, C6/C3, MAX/(C6/C3)); }
	        public long toMinutes(long d) { return x(d, C6/C4, MAX/(C6/C4)); }
	        public long toHours(long d)   { return x(d, C6/C5, MAX/(C6/C5)); }
	        public long toDays(long d)    { return d; }
	        public long convert(long d, TimeUnit u) { return u.toDays(d); }
	        int excessNanos(long d, long m) { return 0; }
	    };
	
	static final long C0=1L;
	static final long C1=C0*1000L;
	static final long C2=C1*1000L;
	static final long C3=C2*1000L;
	static final long C4=C3*60L;
	static final long C5=C4*60L;
	static final long C6=C5*24L;
	
	static final long MAX=Long.MAX_VALUE;

	static long x(long d,long m,long over){
		if(d>over) return Long.MAX_VALUE;
		if(d<-over) return Long.MIN_VALUE;
		return d*m;
	}
	
	public long convert(long sourceDuration,TimeUnit sourceUnit){
		throw new AbstractMethodError();
	}
	
	public long toNanos(long duration){
		throw new AbstractMethodError();
	}
	
	public long toMicros(long duration){
		throw new AbstractMethodError();
	}
	
	public long toMillis(long duration){
		throw new AbstractMethodError();
	}
	
	public long toSeconds(long duration){
		throw new AbstractMethodError();
	}
	
	public long toMinutes(long duration){
		throw new AbstractMethodError();
	}
	
	public long toHours(long duration){
		throw new AbstractMethodError();
	}
	
	public long toDays(long duration){
		throw new AbstractMethodError();
	}
	
	abstract int excessNanos(long d,long m);
	
	public void timedWait(Object obj,long timeout) throws InterruptedException{
		if(timeout>0){
			long ms=toMillis(timeout);
			int ns=excessNanos(timeout, ms);
			obj.wait(ms,ns);
		}
	}
	
	public void timedJoin(Thread thread,long timeout) throws InterruptedException{
		if(timeout>0){
			long ms=toMillis(timeout);
			int ns=excessNanos(timeout, ms);
			thread.join(ms,ns);
		}
	}
	
	public void sleep(long timeout) throws InterruptedException{
		if(timeout>0){
			long ms=toMillis(timeout);
			int ns=excessNanos(timeout, ms);
			Thread.sleep(ms,ns);
		}
	}
}
