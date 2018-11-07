package roguelike_game.character;

import roguelike_game.Items.IArmor;
import roguelike_game.Items.IMoney;
import roguelike_game.Items.IWeapon;

public interface IMonster extends ICharacter {

    int hit ();

    void getHarm(int harm);

    void getWeapon(IWeapon weapon);

    void getArmor(IArmor armor);

    void setMainWeapon(IWeapon weapon);

    void setMainArmor(IArmor armor);

    int getMainWeaponHarm();

    int getMainArmorProtection(int harm);

    void stealMoney(ICharacter character, IMoney money);

}
