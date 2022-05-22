package org.anti_ad.mc.common.vanilla.alias

import net.minecraft.SharedConstants
import net.minecraft.block.entity.BlockEntityType
import net.minecraft.client.network.ClientPlayerInteractionManager
import net.minecraft.client.MinecraftClient
import net.minecraft.client.options.GameOptions
import net.minecraft.client.options.KeyBinding
import net.minecraft.client.resource.language.I18n
import net.minecraft.client.sound.PositionedSoundInstance
import net.minecraft.client.util.Window
import net.minecraft.client.world.ClientWorld
import net.minecraft.server.integrated.IntegratedServer
import net.minecraft.sound.SoundEvents
import net.minecraft.util.Identifier
import net.minecraft.util.Util
import net.minecraft.util.registry.DefaultedRegistry
import net.minecraft.util.registry.Registry
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.sound.SoundEvent
import net.minecraft.client.sound.SoundInstance

import org.anti_ad.mc.common.vanilla.alias.glue.__glue_I18n_translate

typealias MinecraftClient = MinecraftClient
typealias IntegratedServer = IntegratedServer

typealias Window = Window

typealias Identifier = Identifier

typealias Registry<T> = Registry<T>
typealias DefaultedRegistry<T> = DefaultedRegistry<T>

typealias PositionedSoundInstance = PositionedSoundInstance
typealias SoundEvents = SoundEvents


typealias Util = Util
typealias ClientWorld = ClientWorld

typealias SharedConstants = SharedConstants
typealias GameOptions = GameOptions
typealias KeyBinding = KeyBinding
typealias ClientPlayerInteractionManager = ClientPlayerInteractionManager
typealias PlayerEntity = PlayerEntity

typealias SoundEvent = SoundEvent
typealias SoundInstance = SoundInstance

@Suppress("ObjectPropertyName", "HasPlatformType")
inline val `(REGISTRIES-BLOCK_ENTITY_TYPES-IDS)`
    get() = Registry.BLOCK_ENTITY.ids
@Suppress("ObjectPropertyName", "HasPlatformType")
inline val `(REGISTRIES-BLOCK-IDS)`
    get() = Registry.BLOCK.ids
@Suppress("ObjectPropertyName", "HasPlatformType")
inline val `(REGISTRIES-CONTAINER-IDS)`
    get() = Registry.CONTAINER.ids
@Suppress("ObjectPropertyName", "HasPlatformType")
inline val `(REGISTRIES-ITEM-IDS)`
    get() = Registry.ITEM.ids

private fun translate(string: String,
                      vararg objects: Any?): String = I18n.translate(string,
                                                                     *objects)

fun initI18nGlue() {
    __glue_I18n_translate = ::translate
}