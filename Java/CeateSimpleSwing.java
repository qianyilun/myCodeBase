创建一个简单的Swing

// https://www.youtube.com/watch?v=5vSyylPPEko
// --> Creating First Java Swing GUI Application with IntelliJ IDEA IDE

private JPanel mainPanel;

public void display() {
    JFrame frame = new JFrame("Welcome!");
    frame.setContentPane(mainPanel);
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.pack();
    // frame.setLocationRelativeTo(null); <-- 使窗口居中
    frame.setVisible(true);
}