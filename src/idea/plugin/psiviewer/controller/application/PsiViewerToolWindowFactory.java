package idea.plugin.psiviewer.controller.application;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import idea.plugin.psiviewer.controller.project.PsiViewerProjectComponent;
import org.jetbrains.annotations.NotNull;

public class PsiViewerToolWindowFactory implements ToolWindowFactory {
    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
        PsiViewerProjectComponent.getInstance(project).initToolWindow(toolWindow);
    }
}
