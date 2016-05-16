/**
 Copyright (c) 2016, Diego Bezerra <diego.bezerra@gmail.com>
 Permission to use, copy, modify, and/or distribute this software for any purpose
 with or without fee is hereby granted, provided that the above copyright notice
 and this permission notice appear in all copies.
 THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
 REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND
 FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT,
 OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS
 ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 **/
package com.diegodobelo.expandinganimlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.diegodobelo.expandingview.ExpandingItem;
import com.diegodobelo.expandingview.ExpandingList;

public class MainActivity extends AppCompatActivity {
    private ExpandingList mExpandingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mExpandingList = (ExpandingList) findViewById(R.id.expanding_list_main);
        createSubItems();
    }

    private void createSubItems() {
        final ExpandingItem one = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (one != null) {
            one.setIndicatorColorRes(R.color.pink);
            one.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) one.findViewById(R.id.title)).setText("John");
            String[] oneSub = {"House", "Boat", "Candy", "Collection", "Sport", "Ball", "Head"};
            one.createSubItems(oneSub.length);
            for (int i = 0; i < oneSub.length; i++) {
                //TODO: index not needed anymore?
                View view = one.getSubItemView(i);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        one.removeSubItem(v, true);
                    }
                });
                ((TextView) view.findViewById(R.id.sub_title)).setText(oneSub[i]);
            }
            one.collapse();
        }

        ExpandingItem two = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (two != null) {
        two.setIndicatorColorRes(R.color.blue);
            two.setIndicatorIconRes(R.drawable.ic_ghost);
        ((TextView) two.findViewById(R.id.title)).setText("Mary");
            String[] twoSub = {"Cat", "Mouse"};
            for (int i = 0; i < twoSub.length; i++) {
                //TODO: index not needed anymore?
                View view = two.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(twoSub[i]);
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        one.expand();
                    }
                });
            }
            two.collapse();
        }

        ExpandingItem three = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (three != null) {
            three.setIndicatorColorRes(R.color.purple);
            three.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) three.findViewById(R.id.title)).setText("Ana");
            String[] threeSub = {};
            for (int i = 0; i < threeSub.length; i++) {
                //TODO: index not needed anymore?
                View view = three.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(threeSub[i]);
            }
            three.collapse();
        }

        ExpandingItem four = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (four != null) {
            four.setIndicatorColorRes(R.color.orange);
            four.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) four.findViewById(R.id.title)).setText("Paul");
            String[] fourSub = {"Dog", "Horse", "Boat"};
            for (int i = 0; i < fourSub.length; i++) {
                //TODO: index not needed anymore?
                View view = four.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(fourSub[i]);
            }
            four.collapse();
        }

        ExpandingItem five = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (five != null) {
            five.setIndicatorColorRes(R.color.green);
            five.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) five.findViewById(R.id.title)).setText("Rey");
            String[] fiveSub = {};
            for (int i = 0; i < fiveSub.length; i++) {
                //TODO: index not needed anymore?
                View view = five.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(fiveSub[i]);
            }
            five.collapse();
        }

        ExpandingItem six = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (six != null) {
            six.setIndicatorColorRes(R.color.pink);
            six.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) six.findViewById(R.id.title)).setText("Finn");
            String[] sixSub = {"Blastoise", "Charmander"};
            for (int i = 0; i < sixSub.length; i++) {
                //TODO: index not needed anymore?
                View view = six.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(sixSub[i]);
            }
            six.collapse();
        }

        ExpandingItem seven = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (seven != null) {
            seven.setIndicatorColorRes(R.color.orange);
            seven.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) seven.findViewById(R.id.title)).setText("Peter");
            String[] sevenSub = {"R2D2", "BB8"};
            for (int i = 0; i < sevenSub.length; i++) {
                //TODO: index not needed anymore?
                View view = seven.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(sevenSub[i]);
            }
            seven.collapse();
        }

        ExpandingItem eight = mExpandingList.createNewItem(R.layout.expanding_layout);
        if (eight != null) {
            eight.setIndicatorColorRes(R.color.green);
            eight.setIndicatorIconRes(R.drawable.ic_ghost);
            ((TextView) eight.findViewById(R.id.title)).setText("Scott");
            String[] eightSub = {"C3PO"};
            for (int i = 0; i < eightSub.length; i++) {
                //TODO: index not needed anymore?
                View view = eight.createSubItem(i);
                ((TextView) view.findViewById(R.id.sub_title)).setText(eightSub[i]);
            }
            eight.collapse();
        }
    }
}
