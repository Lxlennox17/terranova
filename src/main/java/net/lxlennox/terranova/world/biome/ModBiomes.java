package net.lxlennox.terranova.world.biome;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.entity.ModEntities;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicType;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;


public class ModBiomes {
    public static final RegistryKey<Biome> REDWOOD_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(Terranova.MOD_ID, "redwood_forest"));
    public static final RegistryKey<Biome> LAVENDER_FIELDS = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(Terranova.MOD_ID, "lavender_fields"));
    public static final RegistryKey<Biome> SHADOW_FOREST = RegistryKey.of(RegistryKeys.BIOME,
            Identifier.of(Terranova.MOD_ID, "shadow_forest"));


    public static void bootstrap(Registerable<Biome> context) {
        context.register(REDWOOD_FOREST, redwoodForest(context));
   context.register(LAVENDER_FIELDS,lavenderFields(context));
context.register(SHADOW_FOREST, shadowForest(context));

    }

    private static Biome redwoodForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();



        spawnBuilder.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.WOLF, 5, 4, 4));
        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
DefaultBiomeFeatures.addLargeFerns(biomeBuilder);
      DefaultBiomeFeatures.addTaigaGrass(biomeBuilder);
      DefaultBiomeFeatures.addDefaultMushrooms(biomeBuilder);
      DefaultBiomeFeatures.addSweetBerryBushes(biomeBuilder);

DefaultBiomeFeatures.addMossyRocks(biomeBuilder);


        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.4F)
                .temperature(0.7F)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(4159204)
                        .waterFogColor(329011)
                        .skyColor(0x2a1e6a)
                        .fogColor(0xc0d8ff)
                        .grassColor(0x619961)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_OLD_GROWTH_TAIGA)).build())
                .build();
    }


    private static Biome lavenderFields(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
   DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);
DefaultBiomeFeatures.addPlainsTallGrass(biomeBuilder);




        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.5F)
                .temperature(0.8F)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(6141935)
                        .waterFogColor(6141935)
                        .skyColor(8103167)
                        .fogColor(12638463)
                        .grassColor(11983713)
                       // .foliageColor( 0xCEB5F0)
                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_CHERRY_GROVE)).build())
                .build();
    }

    private static Biome shadowForest(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        DefaultBiomeFeatures.addFarmAnimals(spawnBuilder);
        DefaultBiomeFeatures.addBatsAndMonsters(spawnBuilder);


        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));
        DefaultBiomeFeatures.addDefaultGrass(biomeBuilder);
        DefaultBiomeFeatures.addPlainsTallGrass(biomeBuilder);
        DefaultBiomeFeatures.addTaigaGrass(biomeBuilder);



        return new Biome.Builder()
                .precipitation(true)
                .downfall(0.5F)
                .temperature(0.7F)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects((new BiomeEffects.Builder())
                        .waterColor(6141935)
                        .waterFogColor(6141935)
                        .skyColor(8103167)
                        .fogColor(5592405)
                        .grassColor(5592405)

                        .moodSound(BiomeMoodSound.CAVE)
                        .music(MusicType.createIngameMusic(SoundEvents.MUSIC_OVERWORLD_CHERRY_GROVE)).build())
                .build();
    }
    }

