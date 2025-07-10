package project4;

import project4.color.Red;

public class color {
         
	//covariant
	protected color getColour()
	{
		color c = new color();
		return c;
	}
	
	
	protected Red getcolour() {
		// TODO Auto-generated method stub
		return null;
	}


	// CHILD CLASS 
	class Red extends color{
		
		@Override
		protected Red getcolour()
		{
			Red c = new Red();
			return c;
		}
	}
	
	// CHILD CLASS 
	class Blue extends color{
		
		@Override
		protected Blue getColour()
		{
			Blue c = new Blue();
			return c;
		}
	
}
}
