package Domen;

public class HotDrink extends Bottle {
 // Поля
    private float hotDrinkVolume;

 // Свойства
    public float getHotDrink() {
        return hotDrinkVolume;
    }

    public void setHotDrink(float hotDrink) {
      this.hotDrinkVolume = hotDrinkVolume;
    }

    // конструктор
    public  HotDrink(int price, int place, String name, int tempereture, long id){
      super(price,place,name,id);
      this.hotDrinkVolume = 0f;
    }
   


    @Override
    public String toString() {
         return super.toString() + "\nvolume=" + hotDrinkVolume;
    }

}
