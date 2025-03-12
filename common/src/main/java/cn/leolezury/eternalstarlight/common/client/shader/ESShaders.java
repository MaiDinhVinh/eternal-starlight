package cn.leolezury.eternalstarlight.common.client.shader;

import cn.leolezury.eternalstarlight.common.EternalStarlight;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import net.minecraft.client.renderer.ShaderDefines;
import net.minecraft.client.renderer.ShaderProgram;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.renderer.ShaderInstance;

@Environment(EnvType.CLIENT)
public class ESShaders {
	public static final ShaderProgram RENDERTYPE_GUI_CREST_SELECTION = new ShaderProgram(EternalStarlight.id("core/rendertype_gui_crest_selection"), DefaultVertexFormat.POSITION_TEX, ShaderDefines.EMPTY);
	public static final ShaderProgram RENDERTYPE_STARLIGHT_PORTAL = new ShaderProgram(EternalStarlight.id("core/rendertype_starlight_portal"), DefaultVertexFormat.BLOCK, ShaderDefines.EMPTY);
	public static final ShaderProgram RENDERTYPE_ECLIPSE = new ShaderProgram(EternalStarlight.id("core/rendertype_eclipse"), DefaultVertexFormat.BLOCK, ShaderDefines.EMPTY);
}
