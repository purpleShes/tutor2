package com.tutor.drawertestojlvb;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class AnswerAdapter extends RecyclerView.Adapter<AnswerAdapter.ViewHolder> {

    private List<AnswerList> answerList;
    private AnswerItemClicked callback;

    AnswerAdapter(List<AnswerList> answerList,
                  ResultScreen callback) {
        this.answerList = answerList;
        this.callback = callback;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.result_screen_activity, parent, false);
        final ViewHolder holder = new ViewHolder(view);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // находим позицию элемента, на оторый нажали
                int adapterPosition = holder.getAdapterPosition();
                // проверяем корректность позиции и наличие callback
                if (adapterPosition != RecyclerView.NO_POSITION && callback != null) {
                    // делегируем работу с данными через callback.
                    // В адаптере не должно быть лишней логики.
                    callback.itemClickedCallback(adapterPosition);
                }
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // получаем текущий элемент у нашего листа
        final AnswerList item = answerList.get(position);
        if (item.getNumber() != null & !item.getNumber().isEmpty()) {
            holder.answer_number.setText(item.getNumber());
        } else {
            holder.answer_number.setVisibility(View.GONE);
        }
        if (item.getTheme() != null & !item.getTheme().isEmpty()) {
            holder.theme.setText(item.getTheme());
        } else {
            holder.theme.setVisibility(View.GONE);
        }
        if (item.getTask() != null & !item.getTask().isEmpty()) {
            holder.task.setText(item.getNumber());
        } else {
            holder.task.setVisibility(View.GONE);
        }
        if (item.getLetter() != null & !item.getLetter().isEmpty()) {
            holder.letter.setText(item.getNumber());
        } else {
            holder.letter.setVisibility(View.GONE);
        }
        if (item.getAnswer() != null & !item.getAnswer().isEmpty()) {
            holder.answer_line.setText(item.getNumber());
        } else {
            holder.answer_line.setVisibility(View.GONE);
        }
        if (item.getRating() != 0) {
            holder.ratingBar.setRating(item.getRating());
        } else {
            holder.ratingBar.setVisibility(View.GONE);
        }
    }

    interface AnswerItemClicked {
        void itemClickedCallback(int itemPosition);
    }

    @Override
    public int getItemCount() {
        if (answerList == null) return 0;
        return answerList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView answer_number, theme, task, letter, answer_line;
        RatingBar ratingBar;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            answer_number = itemView.findViewById(R.id.answer_number);
            theme = itemView.findViewById(R.id.theme);
            task = itemView.findViewById(R.id.task);
            letter = itemView.findViewById(R.id.letter);
            answer_line = itemView.findViewById(R.id.answer_line);
            ratingBar = itemView.findViewById(R.id.rating_bar);
        }
    }
}
