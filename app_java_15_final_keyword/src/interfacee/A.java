package interfacee;

//By default all variables in an interface are final and static

public interface A {
	int empId;  //Error (blue, italic and bold i.e. final and static)
	final static int currentId;  //Error (blue, italic and bold  i.e. final and static)
}
