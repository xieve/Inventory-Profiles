package org.anti_ad.mc.common.vanilla.alias

import com.mojang.blaze3d.platform.GlStateManager
import net.minecraft.client.gui.FontRenderer
import net.minecraft.client.gui.AbstractGui
import net.minecraft.client.renderer.LightTexture;// render.DiffuseLighting
import net.minecraft.client.renderer.Matrix4f
import net.minecraft.util.text.StringTextComponent
import net.minecraft.util.text.ITextComponent
import net.minecraft.util.text.Style
import net.minecraft.util.text.TranslationTextComponent
import net.minecraft.util.text.event.ClickEvent
import net.minecraft.util.text.event.HoverEvent

import net.minecraft.util.text.TextFormatting
import net.minecraft.util.math.MathHelper


typealias Text = ITextComponent
typealias TextSerializer = ITextComponent.Serializer
typealias LiteralText = StringTextComponent
typealias TranslatableText = TranslationTextComponent

typealias TextRenderer = FontRenderer

typealias DrawableHelper = AbstractGui

typealias RenderSystem = GlStateManager
typealias MatrixStack = Matrix4f
typealias DiffuseLighting = LightTexture
typealias GlStateManager = GlStateManager
typealias SrcFactor = GlStateManager.SourceFactor
typealias DstFactor = GlStateManager.DestFactor
typealias MathHelper = MathHelper
typealias Style = Style
typealias ClickEvent = ClickEvent
typealias ClickEventAction = ClickEvent.Action
typealias Formatting = TextFormatting

fun getTranslatable(s: String, vararg args: Any): Text = TranslatableText(s, args)

fun getLiteral(s: String): Text = LiteralText(s)
