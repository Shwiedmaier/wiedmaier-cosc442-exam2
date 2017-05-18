package Test;

import java.awt.Color;
import java.util.List;
import org.junit.*;

import game.Creature;
import game.CreatureAi;
import game.Effect;
import game.Inventory;
import game.Item;
import game.Tile;
import game.World;

import static org.junit.Assert.*;

/**
 * The class <code>CreatureTest</code> contains tests for the class <code>{@link Creature}</code>.
 *
 * @generatedBy CodePro at 5/18/17 1:38 PM
 * @author scott1044
 * @version $Revision: 1.0 $
 */
public class CreatureTest {
	/**
	 * Run the Creature(World,char,Color,String,int,int,int) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCreature_1()
		throws Exception {
		World world = new World(new Tile[][][] {});
		char glyph = '';
		Color color = new Color(1);
		String name = "";
		int maxHp = 1;
		int attack = 1;
		int defense = 1;

		Creature result = new Creature(world, glyph, color, name, maxHp, attack, defense);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6dad5864
		assertNotNull(result);
	}

	/**
	 * Run the Item armor() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testArmor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		Item result = fixture.armor();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6d8e9961
		assertNotNull(result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int attackValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testAttackValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.attackValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCanEnter_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4b6e44df
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCanEnter_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@61d486b7
		assertTrue(result);
	}

	/**
	 * Run the boolean canEnter(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCanEnter_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canEnter(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4fec1243
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCanSee_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5fa4636e
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCanSee_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22cc5639
		assertTrue(result);
	}

	/**
	 * Run the boolean canSee(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCanSee_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		boolean result = fixture.canSee(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3660e66c
		assertTrue(result);
	}

	/**
	 * Run the String causeOfDeath() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCauseOfDeath_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		String result = fixture.causeOfDeath();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6e2cac1f
		assertNotNull(result);
	}

	/**
	 * Run the Color color() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testColor_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		Color result = fixture.color();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCreature_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6c2745cf
		assertNotNull(result);
	}

	/**
	 * Run the Creature creature(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testCreature_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Creature result = fixture.creature(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b10bd13
		assertNotNull(result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int defenseValue() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDefenseValue_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.defenseValue();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the String details() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDetails_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		String result = fixture.details();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@55c82193
		assertNotNull(result);
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@13f492de
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@51c29573
	}

	/**
	 * Run the void doAction(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		String message = "";

		fixture.doAction(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3256f57d
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 0, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@11f8b6fd
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@49e24c97
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b9aa29b
	}

	/**
	 * Run the void doAction(Item,String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDoAction_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		String message = "";

		fixture.doAction(item, message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3e11f1f
	}

	/**
	 * Run the void drop(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testDrop_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");

		fixture.drop(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@18f96800
	}

	/**
	 * Run the List<Effect> effects() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testEffects_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		List<Effect> result = fixture.effects();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@75d329b4
		assertNotNull(result);
	}

	/**
	 * Run the int food() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.food();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6b98631b
		assertEquals(0, result);
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testGainXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@177d24df
	}

	/**
	 * Run the void gainXp(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testGainXp_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.gainXp(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4d0b76cd
	}

	/**
	 * Run the char glyph() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testGlyph_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		char result = fixture.glyph();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(' ', result);
	}

	/**
	 * Run the int hp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.hp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Inventory inventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testInventory_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		Inventory result = fixture.inventory();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testIsPlayer_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1809c523
		assertTrue(result);
	}

	/**
	 * Run the boolean isPlayer() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testIsPlayer_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		boolean result = fixture.isPlayer();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5f42eccf
		assertTrue(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testItem_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@218c9800
		assertNotNull(result);
	}

	/**
	 * Run the Item item(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Item result = fixture.item(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@7f7e045a
		assertNotNull(result);
	}

	/**
	 * Run the int level() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testLevel_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.level();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@327280f0
		assertEquals(0, result);
	}

	/**
	 * Run the int mana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.mana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@69c66053
		assertEquals(0, result);
	}

	/**
	 * Run the int maxFood() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMaxFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.maxFood();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@8aba489
		assertEquals(0, result);
	}

	/**
	 * Run the int maxHp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.maxHp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the int maxMana() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.maxMana();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@994fc3e
		assertEquals(0, result);
	}

	/**
	 * Run the void meleeAttack(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMeleeAttack_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.meleeAttack(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@68083f79
	}

	/**
	 * Run the void modifyAttackValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyAttackValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int value = 1;

		fixture.modifyAttackValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDefenseValue(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyDefenseValue_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int value = 1;

		fixture.modifyDefenseValue(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyDetectCreatures(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyDetectCreatures_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyDetectCreatures(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@34c73cb0
	}

	/**
	 * Run the void modifyFood(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyFood_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '@', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyFood(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@42b8f654
	}

	/**
	 * Run the void modifyMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6dcd1d6
	}

	/**
	 * Run the void modifyMaxHp(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyMaxHp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyMaxHp(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void modifyMaxMana(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyMaxMana_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyMaxMana(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@663a030f
	}

	/**
	 * Run the void modifyRegenHpPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyRegenHpPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyRegenHpPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@35c04025
	}

	/**
	 * Run the void modifyRegenManaPer1000(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyRegenManaPer1000_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int amount = 1;

		fixture.modifyRegenManaPer1000(amount);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4d73d6ba
	}

	/**
	 * Run the void modifyVisionRadius(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testModifyVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int value = 1;

		fixture.modifyVisionRadius(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMoveBy_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int mx = 0;
		int my = 0;
		int mz = 1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@179c7d5e
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMoveBy_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int mx = 1;
		int my = 1;
		int mz = 2;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2aa3c052
	}

	/**
	 * Run the void moveBy(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testMoveBy_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int mx = 0;
		int my = 1;
		int mz = -1;

		fixture.moveBy(mx, my, mz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@344fda6d
	}

	/**
	 * Run the String name() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testName_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		String result = fixture.name();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the String nameOf(Item) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testNameOf_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");

		String result = fixture.nameOf(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@50cd8bd8
		assertNotNull(result);
	}

	/**
	 * Run the void notify(String,Object[]) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testNotify_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		String message = "";

		fixture.notify(message);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@1b6c15c1
	}

	/**
	 * Run the Tile realTile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testRealTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.realTile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@60f0543b
		assertNotNull(result);
	}

	/**
	 * Run the void setCreatureAi(CreatureAi) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testSetCreatureAi_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		CreatureAi ai = new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1));

		fixture.setCreatureAi(ai);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void summon(Creature) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testSummon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Creature other = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);

		fixture.summon(other);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@753bc621
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@50710b8f
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@61beaa20
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_3()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@22e1279b
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_4()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@49c0e2bd
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_5()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@722f9758
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_6()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@71eed18c
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_7()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@513449ad
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_8()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b30229c
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_9()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5820dcf5
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_10()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@54b98126
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_11()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5b5b6b97
	}

	/**
	 * Run the void throwItem(Item,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testThrowItem_12()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		Item item = new Item('', new Color(1), "", "");
		item.setQuaffEffect(new Effect(1));
		int wx = 1;
		int wy = 1;
		int wz = 1;

		fixture.throwItem(item, wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@44dd83f5
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@46dac97c
		assertNotNull(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testTile_2()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;
		int wx = 1;
		int wy = 1;
		int wz = 1;

		Tile result = fixture.tile(wx, wy, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@59605435
		assertNotNull(result);
	}

	/**
	 * Run the void update() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		fixture.update();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@63873c53
	}

	/**
	 * Run the int visionRadius() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testVisionRadius_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.visionRadius();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertEquals(0, result);
	}

	/**
	 * Run the Item weapon() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testWeapon_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		Item result = fixture.weapon();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@41b4009b
		assertNotNull(result);
	}

	/**
	 * Run the int xp() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Test
	public void testXp_1()
		throws Exception {
		Creature fixture = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		fixture.modifyHp(1, "");
		fixture.setCreatureAi(new CreatureAi(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1)));
		fixture.x = 1;
		fixture.y = 1;
		fixture.z = 1;

		int result = fixture.xp();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@20fb037c
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/17 1:38 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CreatureTest.class);
	}
}