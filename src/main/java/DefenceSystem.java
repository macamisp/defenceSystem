/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



import java.util.ArrayList;



interface DefenceObserverableInterface{
    public void setPosition(int position);
    public void updateButtons();
    public void areaClear(boolean clear);
    public void getMsgMain(String msg);
}
class DefenceObserverable implements DefenceObserverableInterface{
    int position;

    private ArrayList<DefenceObserver>observerList=new ArrayList<>();
    public void addDefenceObserver(DefenceObserver ob){
        observerList.add(ob);
    }
    public void setPosition(int position){
        if (this.position!=position) {
            this.position=position;
            notifyDefence();
        }
    }
    
    public void updateButtons(){}
    
    public void areaClear(boolean clear){
        for (DefenceObserver ob:observerList) {
            ob.areaClearLabel(clear);
        }
    }
    
    public void getMsgMain(String msg){
        for (DefenceObserver ob:observerList) {
            ob.getMsgMain(msg);
        }
    }

    public void notifyDefence(){
        for (DefenceObserver ob:observerList) {
            ob.update(position);
            updateButtons();
        }
    }
}


