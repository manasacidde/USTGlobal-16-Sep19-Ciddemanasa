package com.ustglobal.objectclass;

public class USB {
	public static void connect(Object obj) {
		if(obj instanceof Pendrive)
		{
			Pendrive p = (Pendrive)obj;
			p.write();
			p.read();
			
		}
		else if(obj instanceof Mouse) {
			Mouse m = (Mouse)obj;
			m.click();
			m.scroll();
		}
		else {
			System.out.println("invalid");
		}
			
			
	}

}
