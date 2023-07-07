package com.piggyplugins.PiggyUtils;

import com.example.EthanApiPlugin.EthanApiPlugin;
import com.example.PacketUtils.PacketUtilsPlugin;
import lombok.extern.slf4j.Slf4j;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDependency;
import net.runelite.client.plugins.PluginDescriptor;

@PluginDescriptor(name = "PiggyUtils",
                description = "Utility Plugin for PiggyPlugins",
                tags = {"piggy","ethan"})
@PluginDependency(EthanApiPlugin.class)
@PluginDependency(PacketUtilsPlugin.class)
@Slf4j
public class PiggyUtilsPlugin extends Plugin {
    @Override
    protected void startUp() throws Exception {
        log.info("[PiggyUtils] Piggy Utils started");
    }
}