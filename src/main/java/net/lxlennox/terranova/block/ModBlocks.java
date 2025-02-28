package net.lxlennox.terranova.block;



import com.sun.jna.platform.unix.solaris.Kstat2StatusException;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.particle.ModParticleTypes;
import net.lxlennox.terranova.world.ModConfiguredFeatures;
import net.lxlennox.terranova.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;


public class ModBlocks {


    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block REDWOOD_SAPLING = registerBlock("redwood_sapling",
            new SaplingBlock(ModSaplingGenerators.REDWOOD,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block POTTED_REDWOOD_SAPLING=Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"potted_redwood_sapling"),
            new FlowerPotBlock(REDWOOD_SAPLING,AbstractBlock.Settings.copy(Blocks.POTTED_SPRUCE_SAPLING).nonOpaque()));




  public static final Block REDWOOD_STAIRS=registerBlock("redwood_stairs",
          new StairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(),
                  AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));
public static final Block REDWOOD_SLAB=registerBlock("redwood_slab",
          new SlabBlock(AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

public static final Block REDWOOD_BUTTON=registerBlock("redwood_button",
          new ButtonBlock(BlockSetType.SPRUCE,15, AbstractBlock.Settings.create().strength(2f).burnable().noCollision().sounds(BlockSoundGroup.WOOD)));
public static final Block REDWOOD_PRESSURE_PLATE=registerBlock("redwood_pressure_plate",
          new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

public static final Block REDWOOD_FENCE=registerBlock("redwood_fence",
          new FenceBlock(AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));
public static final Block REDWOOD_FENCE_GATE=registerBlock("redwood_fence_gate",
          new FenceGateBlock(WoodType.SPRUCE,
                  AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block REDWOOD_DOOR = registerBlock("redwood_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));


    private static final Identifier REDWOOD_SIGN_TEXTURE = Identifier.of(Terranova.MOD_ID,"entity/signs/redwood");
    private static final Identifier REDWOOD_HANGING_SIGN_TEXTURE = Identifier.of(Terranova.MOD_ID,"entity/signs/hanging/redwood");
    private static final Identifier REDWOOD_HANGING_SIGN_GUI_TEXTURE = Identifier.of(Terranova.MOD_ID,"textures/gui/hanging_signs/redwood");

    public static final TerraformSignBlock REDWOOD_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"redwood_sign"),
            new TerraformSignBlock(REDWOOD_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallSignBlock REDWOOD_WALL_SIGN =Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"redwood_wall_sign"),
            new TerraformWallSignBlock(REDWOOD_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformHangingSignBlock REDWOOD_HANGING_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"redwood_hanging_sign"),
            new TerraformHangingSignBlock(REDWOOD_HANGING_SIGN_TEXTURE, REDWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallHangingSignBlock REDWOOD_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"redwood_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(REDWOOD_HANGING_SIGN_TEXTURE, REDWOOD_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(REDWOOD_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));


    public static final Block LAVENDER_LOG = registerBlock("lavender_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block LAVENDER_WOOD = registerBlock("lavender_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_LAVENDER_LOG = registerBlock("stripped_lavender_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_LAVENDER_WOOD = registerBlock("stripped_lavender_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));

    public static final Block LAVENDER_PLANKS = registerBlock("lavender_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));

    public static final Block LAVENDER_LEAVES = registerBlock("lavender_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));

    public static final Block LAVENDER_SAPLING = registerBlock("lavender_sapling",
            new SaplingBlock(ModSaplingGenerators.LAVENDER,AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));


    public static final Block POTTED_LAVENDER_SAPLING=Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"potted_lavender_sapling"),
            new FlowerPotBlock(LAVENDER_SAPLING,AbstractBlock.Settings.copy(Blocks.POTTED_SPRUCE_SAPLING).nonOpaque()));



  public static final Block LAVENDER_STAIRS=registerBlock("lavender_stairs",
          new StairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(),
                  AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));
public static final Block LAVENDER_SLAB=registerBlock("lavender_slab",
          new SlabBlock(AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

public static final Block LAVENDER_BUTTON=registerBlock("lavender_button",
          new ButtonBlock(BlockSetType.SPRUCE,15, AbstractBlock.Settings.create().strength(2f).burnable().noCollision().sounds(BlockSoundGroup.WOOD)));
public static final Block LAVENDER_PRESSURE_PLATE=registerBlock("lavender_pressure_plate",
          new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

public static final Block LAVENDER_FENCE=registerBlock("lavender_fence",
          new FenceBlock(AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));
public static final Block LAVENDER_FENCE_GATE=registerBlock("lavender_fence_gate",
          new FenceGateBlock(WoodType.SPRUCE,
                  AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block LAVENDER_DOOR = registerBlock("lavender_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block LAVENDER_TRAPDOOR = registerBlock("lavender_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));





    private static final Identifier LAVENDER_SIGN_TEXTURE = Identifier.of(Terranova.MOD_ID,"entity/signs/lavender");
    private static final Identifier LAVENDER_HANGING_SIGN_TEXTURE = Identifier.of(Terranova.MOD_ID,"entity/signs/hanging/lavender");
    private static final Identifier LAVENDER_HANGING_SIGN_GUI_TEXTURE = Identifier.of(Terranova.MOD_ID,"textures/gui/hanging_signs/lavender");

    public static final TerraformSignBlock LAVENDER_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"lavender_sign"),
            new TerraformSignBlock(LAVENDER_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(LAVENDER_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallSignBlock LAVENDER_WALL_SIGN =Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"lavender_wall_sign"),
            new TerraformWallSignBlock(LAVENDER_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(LAVENDER_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformHangingSignBlock LAVENDER_HANGING_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"lavender_hanging_sign"),
            new TerraformHangingSignBlock(LAVENDER_HANGING_SIGN_TEXTURE, LAVENDER_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(LAVENDER_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallHangingSignBlock LAVENDER_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"lavender_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(LAVENDER_HANGING_SIGN_TEXTURE, LAVENDER_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(LAVENDER_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

public static final Block LAVENDER_BUSH=registerBlock("lavender_bush",
        new TallFlowerBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).noCollision().breakInstantly()
                .sounds(BlockSoundGroup.GRASS).offset(AbstractBlock.OffsetType.XZ).burnable().pistonBehavior(PistonBehavior.DESTROY)));

public static final Block LAVENDER=registerBlock("lavender",
        new FlowerBlock(StatusEffects.FIRE_RESISTANCE,10,AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));

public static final Block POTTED_LAVENDER=Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"potted_lavender"),
        new FlowerPotBlock(LAVENDER,AbstractBlock.Settings.copy(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));

//SHADOW FOREST

    public static final Block SHADOW_LOG = registerBlock("shadow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)));

    public static final Block SHADOW_PLANKS = registerBlock("shadow_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.DARK_OAK_PLANKS)));

    public static final Block SHADOW_WOOD = registerBlock("shadow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));

    public static final Block STRIPPED_SHADOW_LOG = registerBlock("stripped_shadow_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_SHADOW_WOOD = registerBlock("stripped_shadow_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));



    public static final Block SHADOW_LEAVES = registerBlock("shadow_leaves",
            new LeavesBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LEAVES)));

    public static final Block SHADOW_SAPLING = registerBlock("shadow_sapling",
            new SaplingBlock(ModSaplingGenerators.SHADOW,AbstractBlock.Settings.copy(Blocks.DARK_OAK_SAPLING)));

    public static final Block POTTED_SHADOW_SAPLING=Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"potted_shadow_sapling"),
            new FlowerPotBlock(SHADOW_SAPLING,AbstractBlock.Settings.copy(Blocks.POTTED_SPRUCE_SAPLING).nonOpaque()));






    public static final Block SHADOW_STAIRS=registerBlock("shadow_stairs",
            new StairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block SHADOW_SLAB=registerBlock("shadow_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block SHADOW_BUTTON=registerBlock("shadow_button",
            new ButtonBlock(BlockSetType.SPRUCE,15, AbstractBlock.Settings.create().strength(2f).burnable().noCollision().sounds(BlockSoundGroup.WOOD)));
    public static final Block SHADOW_PRESSURE_PLATE=registerBlock("shadow_pressure_plate",
            new PressurePlateBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block SHADOW_FENCE=registerBlock("shadow_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));
    public static final Block SHADOW_FENCE_GATE=registerBlock("shadow_fence_gate",
            new FenceGateBlock(WoodType.SPRUCE,
                    AbstractBlock.Settings.create().strength(2f).burnable().sounds(BlockSoundGroup.WOOD)));

    public static final Block SHADOW_DOOR = registerBlock("shadow_door",
            new DoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));
    public static final Block SHADOW_TRAPDOOR = registerBlock("shadow_trapdoor",
            new TrapdoorBlock(BlockSetType.SPRUCE, AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()));





    private static final Identifier SHADOW_SIGN_TEXTURE = Identifier.of(Terranova.MOD_ID,"entity/signs/shadow");
    private static final Identifier SHADOW_HANGING_SIGN_TEXTURE = Identifier.of(Terranova.MOD_ID,"entity/signs/hanging/shadow");
    private static final Identifier SHADOW_HANGING_SIGN_GUI_TEXTURE = Identifier.of(Terranova.MOD_ID,"textures/gui/hanging_signs/shadow");

    public static final TerraformSignBlock SHADOW_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"shadow_sign"),
            new TerraformSignBlock(SHADOW_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(SHADOW_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallSignBlock SHADOW_WALL_SIGN =Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"shadow_wall_sign"),
            new TerraformWallSignBlock(SHADOW_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(SHADOW_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformHangingSignBlock SHADOW_HANGING_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"shadow_hanging_sign"),
            new TerraformHangingSignBlock(SHADOW_HANGING_SIGN_TEXTURE, SHADOW_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(SHADOW_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallHangingSignBlock SHADOW_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"shadow_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(SHADOW_HANGING_SIGN_TEXTURE, SHADOW_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(SHADOW_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));



    public static final Block ECLIPSE_ORE=registerBlock("eclipse_ore",
      new ExperienceDroppingBlock(UniformIntProvider.create(2,5),AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));

    public static final Block DEEPSLATE_ECLIPSE_ORE=registerBlock("deepslate_eclipse_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3,6),AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final Block ECLIPSE_QUARTZ_BLOCK=registerBlock("eclipse_quartz_block",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));

    public static final Block ECLIPSE_QUARTZ_BRICKS=registerBlock("eclipse_quartz_bricks",
            new Block(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));









    public static final Block SHADOW_TORCH=registerBlock("shadow_torch",
        new TorchBlock(ModParticleTypes.SHADOW_FLAME,AbstractBlock.Settings.create().noCollision().breakInstantly()
                .luminance((state) -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block WALL_SHADOW_TORCH = registerBlock("wall_shadow_torch", new WallTorchBlock(ModParticleTypes.SHADOW_FLAME,
            AbstractBlock.Settings.create().noCollision().breakInstantly().luminance((state) -> 14).sounds(BlockSoundGroup.WOOD).
                    dropsLike(SHADOW_TORCH).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block SHADOW_LANTERN=registerBlock("shadow_lantern",
            new LanternBlock(AbstractBlock.Settings.copy(Blocks.LANTERN)));


    public static final Block NIGHTBLOOM=registerBlock("nightbloom",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE,10,AbstractBlock.Settings.copy(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));

    public static final Block POTTED_NIGHTBLOOM=Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"potted_nightbloom"),
            new FlowerPotBlock(NIGHTBLOOM,AbstractBlock.Settings.copy(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));


    public static final Block GLOWING_MUSHROOM=registerBlock("glowing_mushroom",
            new MushroomPlantBlock(ModConfiguredFeatures.GLOWING_MUSHROOM_KEY,AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM)
                    .luminance((state)->5).nonOpaque().noCollision()));


    public static final Block POTTED_GLOWING_MUSHROOM=Registry.register(Registries.BLOCK,Identifier.of(Terranova.MOD_ID,"potted_glowing_mushroom"),
            new FlowerPotBlock(GLOWING_MUSHROOM,AbstractBlock.Settings.copy(Blocks.POTTED_RED_MUSHROOM).nonOpaque()));

public static final Block GLOWING_MUSHROOM_BLOCK=registerBlock("glowing_mushroom_block",
        new MushroomBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).luminance((state) -> 5)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Terranova.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Terranova.MOD_ID, name),
      new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Terranova.LOGGER.info("Registering Mod Blocks for"+Terranova.MOD_ID);


        } ;




    }

