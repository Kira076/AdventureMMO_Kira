package me.mrdaniel.adventuremmo.data;

import java.util.List;
import java.util.Map;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.key.KeyFactory;
import org.spongepowered.api.data.value.BaseValue;
import org.spongepowered.api.data.value.ValueFactory;
import org.spongepowered.api.data.value.mutable.ListValue;
import org.spongepowered.api.data.value.mutable.MapValue;
import org.spongepowered.api.data.value.mutable.Value;

import com.google.common.reflect.TypeToken;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.item.enchantment.Enchantment;
import org.spongepowered.api.util.generator.dummy.DummyObjectProvider;

import javax.annotation.Nullable;

@SuppressWarnings("serial")
public class MMOKeys {

	public static ValueFactory FACTORY = Sponge.getRegistry().getValueFactory();
	public static Key<MapValue<String, Long>> DELAYS;
	public static Key<MapValue<String, Long>> ABILITIES;
	public static Key<Value<Boolean>> ACTION_BAR;
	public static Key<Value<Boolean>> SCOREBOARD;
	public static Key<Value<Boolean>> SCOREBOARD_PERMANENT;
	public static Key<ListValue<Enchantment>> ENCHANTS;
	public static Key<Value<String>> NAME;
	public static Key<Value<Integer>> DURABILITY;

/*
	public static ValueFactory FACTORY = Sponge.getRegistry().getValueFactory();
	public static Key<MapValue<String, Long>> DELAYS = DummyObjectProvider.createExtendedFor(Key.class, "DELAYS");
	public static Key<MapValue<String, Long>> ABILITIES = DummyObjectProvider.createExtendedFor(Key.class, "ABILITIES");
	public static Key<Value<Boolean>> ACTION_BAR = DummyObjectProvider.createExtendedFor(Key.class, "ACTION_BAR");
	public static Key<Value<Boolean>> SCOREBOARD = DummyObjectProvider.createExtendedFor(Key.class, "SCOREBOARD");
	public static Key<Value<Boolean>> SCOREBOARD_PERMANENT = DummyObjectProvider.createExtendedFor(Key.class, "SCOREBOARD_PERMANENT");
	public static Key<ListValue<Enchantment>> ENCHANTS = DummyObjectProvider.createExtendedFor(Key.class, "ENCHANTS");
	public static Key<Value<String>> NAME = DummyObjectProvider.createExtendedFor(Key.class, "NAME");
	public static Key<Value<Integer>> DURABILITY = DummyObjectProvider.createExtendedFor(Key.class, "DURABILITY");

	@Listener
	public void onPreInit(final GamePreInitializationEvent e) {

		// MMOData
		DELAYS = Key.builder().type(new TypeToken<MapValue<String, Long>>(){}).id("mmo:delays").name("MMO Delays").query(DataQuery.of("delays")).build();
		ABILITIES = Key.builder().type(new TypeToken<MapValue<String, Long>>(){}).id("mmo:abilities").name("MMO Abilities").query(DataQuery.of("abilities")).build();

		ACTION_BAR = Key.builder().type(new TypeToken<Value<Boolean>>(){}).id("mmo:action_bar").name("MMO Action Bar").query(DataQuery.of("action_bar")).build();
		SCOREBOARD = Key.builder().type(new TypeToken<Value<Boolean>>(){}).id("mmo:scoreboard").name("MMO Scoreboard").query(DataQuery.of("scoreboard")).build();
		SCOREBOARD_PERMANENT = Key.builder().type(new TypeToken<Value<Boolean>>(){}).id("mmo:scoreboard_permanent").name("MMO Scoreboard Permanent").query(DataQuery.of("scoreboard_permanent")).build();

		// SuperToolData
		ENCHANTS = Key.builder().type(new TypeToken<ListValue<Enchantment>>(){}).id("mmo:enchants").name("MMO Enchants").query(DataQuery.of("enchants")).build();
		NAME = Key.builder().type(new TypeToken<Value<String>>(){}).id("mmo:name").name("MMO Name").query(DataQuery.of("name")).build();
		DURABILITY = Key.builder().type(new TypeToken<Value<Integer>>(){}).id("mmo:durability").name("MMO Durability").query(DataQuery.of("durability")).build();
	}*/

}