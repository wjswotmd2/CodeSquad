package This05;

public class Button {

    interface OnClickListener {
        void onClick();
    }

    OnClickListener onClickListener;


    void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    void touch() {
        onClickListener.onClick();;
    }

}
