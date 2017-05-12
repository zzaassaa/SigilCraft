package com.draganz.sigilcraft;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = SigilCraft.MOD_ID, name = SigilCraft.MOD_NAME, version = SigilCraft.VERSION, guiFactory = SigilCraft.GUI_FACTORY)
public class SigilCraft {
	
	public static final String MOD_ID = "sigilc";
	public static final String MOD_NAME = "Sigil Craft";
	public static final String VERSION = "1.11.2-0.1a";
	public static final String GUI_FACTORY = "com.draganz.sigilcraft.client.gui.GuiFactory";
	public static final String CLIENT_PROXY = "com.draganz.sigilcraft.proxy.ClientProxy";
	public static final String SERVER_PROXY = "com.draganz.sigilcraft.proxy.ServerProxy";

	/*
	 * @Mod(modid = EquivalentExchange.MOD_ID,
        name = "Equivalent Exchange 3",
        certificateFingerprint = EquivalentExchange.FINGERPRINT,
        version = "@MOD_VERSION@",
        guiFactory = "com.pahimar.ee.client.gui.GuiFactory",
        updateJSON = "http://ee.pahimar.com/update/versions.json")
public class EquivalentExchange {

    public static final String MOD_ID = "ee";
    static final String FINGERPRINT = "@FINGERPRINT@";

    @Mod.Instance(EquivalentExchange.MOD_ID)
    public static EquivalentExchange instance;

    @SidedProxy(clientSide = "com.pahimar.ee.proxy.ClientProxy", serverSide = "com.pahimar.ee.proxy.ServerProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event) {

        if (FINGERPRINT.equals("@FINGERPRINT@")) {
            LogHelper.info(Messages.NO_FINGERPRINT_MESSAGE);
        }
        else {
            LogHelper.warn(Messages.INVALID_FINGERPRINT_MESSAGE);
        }
    }

    @Mod.EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        proxy.onServerStarting(event);
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.onPreInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.onInit(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.onPostInit(event);
    }

    @Mod.EventHandler
    public void onServerStopping(FMLServerStoppingEvent event) {
        proxy.onServerStopping(event);
    }

    public EnergyValueRegistry getEnergyValueRegistry() {
        return EnergyValueRegistry.INSTANCE;
    }

    public RecipeRegistry getRecipeRegistry() {
        return RecipeRegistry.INSTANCE;
    }

    public AludelRecipeManager getAludelRecipeManager() {
        return AludelRecipeManager.getInstance();
    }

    public BlacklistRegistry getBlacklistRegistry() {
        return BlacklistRegistry.INSTANCE;
    }

    public AlchemyArrayRegistry getAlchemyArrayRegistry() {
        return AlchemyArrayRegistry.INSTANCE;
    }

    public PlayerKnowledgeRegistry getPlayerKnowledgeRegistry() {
        return PlayerKnowledgeRegistry.INSTANCE;
    }
}
	 */
}
