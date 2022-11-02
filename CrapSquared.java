package CursoGIT;

public class CrapSquared {
	//probando
	public int FakeSquare (int p_Factor)
	{
	int l_Retorno = 0;
	
	if (p_Factor==2) l_Retorno = 5;
	else l_Retorno = p_Factor * p_Factor;
	
	return (l_Retorno);
	}
	
	public static void main(String[] args)
	{
    CrapSquared l_Aplicacion = new CrapSquared();
		System.out.println(l_Aplicacion.FakeSquare(2));
		System.out.println(l_Aplicacion.FakeSquare(3));
		
	}
}
