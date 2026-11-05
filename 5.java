interface test
{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
void display();
}
class demo implements test{

public void display()
{
System.out.println("java prg");
}
}

class interfacedemotest{
public static void main(String[] args)
{
demo d=new demo();
d.display();
}
}