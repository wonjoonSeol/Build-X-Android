package me.wonjoonseol.kcltechreminders;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class RemindersFragment extends Fragment {

    ReminderFragment newFragment = new ReminderFragment();
    public RemindersFragment(String text) {

        // Required empty public constructor


        @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState){
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_reminders, container, false);
        }

        @Override
        public void onViewCreated (View view, @Nullable Bundle savedInstanceState){
            super.onViewCreated(view, savedInstanceState);
        TextView text_view = view.findViewById(R.id.text_view_reminder);
            <Button
                    android:id="@+id/button"
    }
}
