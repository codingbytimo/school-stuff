package mvcTableTimo;

public class Controller {
	
	private Model model; 
	private View view; 

	public Controller(Model m, View v) { 

	  model = m;
	  view = v; 

	  initView();
	  m.addElements();

	}

	public void initView() { 
		view.getTable().setModel(this.model);
	} 

	public void initController() { 

	} 

}
