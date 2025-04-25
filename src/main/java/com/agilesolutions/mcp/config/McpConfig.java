package com.agilesolutions.mcp.config;

import com.agilesolutions.mcp.tools.NotificationTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class McpConfig {

    @Bean
    public ToolCallbackProvider tools(NotificationTools notificationTools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(notificationTools)
                .build();
    }
}