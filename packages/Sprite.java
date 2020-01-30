package packages;

import java.awt.*;
//import ch.idsia.benchmark.mario.engine.GlobalOptions;
//import ch.idsia.benchmark.mario.engine.MarioVisualComponent;
//import ch.idsia.benchmark.mario.engine.level.SpriteTemplate;

public class Sprite {
	public static final int KIND_NONE = 0;
	public static final int KIND_MARIO = -31;
	public static final int KIND_GOOMBA = 80;
	public static final int KIND_GOOMBA_WINGED = 95;
	public static final int KIND_RED_KOOPA = 82;
	public static final int KIND_RED_KOOPA_WINGED = 97;
	public static final int KIND_GREEN_KOOPA = 81;
	public static final int KIND_GREEN_KOOPA_WINGED = 96;
	public static final int KIND_BULLET_BILL = 84;
	public static final int KIND_SPIKY = 93;
	public static final int KIND_SPIKY_WINGED = 99;
	public static final int KIND_ENEMY_FLOWER = 91;
	public static final int KIND_WAVE_GOOMBA = 98;
	public static final int KIND_SHELL = 13;
	public static final int KIND_MUSHROOM = 2;
	public static final int KIND_GREEN_MUSHROOM = 9;
	public static final int KIND_PRINCESS = 49;
	public static final int KIND_FIRE_FLOWER = 3;
	public static final int KIND_PARTICLE = 21;
	public static final int KIND_SPARCLE = 22;
	public static final int KIND_COIN_ANIM = 1;
	public static final int KIND_FIREBALL = 25;
	public static final int KIND_UNDEF = -42;
	
	public static SpriteContext spriteContext;
	public static byte kind = KIND_UNDEF;
	protected static float GROUND_INERTIA = 0.89f;
	protected static float AIR_INERTIA = 0.89f;

	public float xOld, yOld, x, y, xa, ya;
	public int mapX, mapY;
	public int xPic, yPic;
	public int wPic = 32;
	public int hPic = 32;
	public int xPicO, yPicO;
	public boolean xFlipPic = false;
	public boolean yFlipPic = false;
	public Image[][] sheet;
	public Image[][] prevSheet;

	public boolean visible = true;
	public int layer = 1;
	
	public SpriteTemplate spriteTemplate;
	
	public Sprite() {
		kind = KIND_UNDEF;
	}
	
	public static void main(String[] args) {
		Sprite s = new Sprite();
		System.out.println(Sprite.kind);
	}
}
