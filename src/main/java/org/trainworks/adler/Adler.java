package org.trainworks.adler;

import org.trainworks.adler.proxies.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Adler {
	
	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {		
				
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {		
				
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
