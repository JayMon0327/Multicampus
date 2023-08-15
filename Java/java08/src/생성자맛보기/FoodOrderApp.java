package 생성자맛보기;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderApp extends JFrame {
    private static final int CHICKEN_PRICE = 10000;
    private static final int PIZZA_PRICE = 12000;
    private static final int HAMBURGER_PRICE = 8000;

    private int chickenCount = 0;
    private int pizzaCount = 0;
    private int hamburgerCount = 0;

    private JLabel chickenCountLabel;
    private JLabel pizzaCountLabel;
    private JLabel hamburgerCountLabel;
    private JLabel totalPriceLabel;

    public FoodOrderApp() {
        setTitle("음식 주문 앱");
        setSize(350, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI();

        setVisible(true);
    }

    private void createUI() {
        // 치킨
        JLabel chickenLabel = new JLabel("치킨");
        JButton chickenButton = new JButton(new ImageIcon("chicken.png"));
        chickenCountLabel = new JLabel("0");

        chickenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chickenCount++;
                updateUI();
            }
        });

        add(chickenLabel);
        add(chickenButton);
        add(chickenCountLabel);

        // 피자
        JLabel pizzaLabel = new JLabel("피자");
        JButton pizzaButton = new JButton(new ImageIcon("pizza.png"));
        pizzaCountLabel = new JLabel("0");

        pizzaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pizzaCount++;
                updateUI();
            }
        });

        add(pizzaLabel);
        add(pizzaButton);
        add(pizzaCountLabel);

        // 햄버거
        JLabel hamburgerLabel = new JLabel("햄버거");
        JButton hamburgerButton = new JButton(new ImageIcon("hamburger.png"));
        hamburgerCountLabel = new JLabel("0");

        hamburgerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hamburgerCount++;
                updateUI();
            }
        });

        add(hamburgerLabel);
        add(hamburgerButton);
        add(hamburgerCountLabel);

        // 총 금액
        JLabel totalLabel = new JLabel("총 금액:");
        totalPriceLabel = new JLabel("0원");

        add(totalLabel);
        add(totalPriceLabel);
    }

    private void updateUI() {
        chickenCountLabel.setText(Integer.toString(chickenCount));
        pizzaCountLabel.setText(Integer.toString(pizzaCount));
        hamburgerCountLabel.setText(Integer.toString(hamburgerCount));

        int totalPrice = (chickenCount * CHICKEN_PRICE) + (pizzaCount * PIZZA_PRICE) + (hamburgerCount * HAMBURGER_PRICE);
        totalPriceLabel.setText(totalPrice + "원");
        }
}
   
