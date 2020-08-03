package swingProject.gui;

import swingProject.componentView.componentsMenu.ComponentsMenu;
import swingProject.componentView.powerSupplyView.PowerSupplyView;
import swingProject.entities.computerComponents.PowerSupply;
import swingProject.gui.menu.ApplicationMenu;
import swingProject.gui.startPanel.StartPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Основной фрейм
 */

public class MainFrame extends JFrame {
    private JPanel contentPanel;
    private StartPanel startPanel;
    private ComponentsMenu componentsMenu;

    public MainFrame() {
        setTitle("Меню");
        setSize(new Dimension(800,600));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        contentPanel = new JPanel();
        startPanel = new StartPanel();
        componentsMenu = new ComponentsMenu();
        contentPanel = startPanel;

        JLabel label = new JLabel("Версия программы 0.0.1");

        add(contentPanel);
        add(new ApplicationMenu(),BorderLayout.NORTH);
        add(label,BorderLayout.PAGE_END);           // TODO:перенести label в другой угол.

        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Отрисовка панели
     */
    public void setStartPanelEvent() {
        setContent(startPanel);

    }

    /**
     * Открыть окно с информацие о программе
     */
    public void openAboutDialogEvent() {
        JOptionPane.showMessageDialog(this, "Program for home using", "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Выйти из приложения
     */
    public void closeApplicationEvent() {
        System.exit(-1);
    }


    /**
     * Отрисовка панели с комплектующими
     */
    public void setComponentsChoiceEvent() {
        setContent(componentsMenu);
    }

    /**
     * Отрисовка новой панели
     * @param panel
     */
    public void setContent(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
