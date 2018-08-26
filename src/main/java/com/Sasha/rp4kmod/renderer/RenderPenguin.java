package com.Sasha.rp4kmod.renderer;

import com.Sasha.rp4kmod.RP4KMod;
import com.Sasha.rp4kmod.entity.Entity_Penguin;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderPenguin extends RenderLiving{
	private float scale;
	public RenderPenguin(RenderManager rendermanagerIn, ModelBase modelBaseIn, float shadowsizeIn, float size) {
		super(rendermanagerIn, modelBaseIn, shadowsizeIn * size);
		this.scale = size;
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation(RP4KMod.MODID + ":" +
	"texture/entity/penguin.png");
	}/*
	protected void preRenderCallback(Entity_Penguin Globobgabgalab, float size){
		GlStateManager.translate(this.scale, this.scale, this.scale); 
	}
	public void func_82422_c()
	{
		GlStateManager.translate(0.0F, 0.1875F, 0.0F);
	}
	protected void preRenderCallback(EntityLivingBase Globobgabgalab, float size)
	{
		this.preRenderCallback((Entity_Penguin)Globobgabgalab, size);
	} */
}
