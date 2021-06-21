package exc01;

public class ClasseGenerica<T> {
	
	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClasseGenerica [t=");
		builder.append(t);
		builder.append("]");
		return builder.toString();
	}
	
	

}
