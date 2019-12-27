package com.wizardapps.cprogrammingforengineering;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class MyexListadapter extends BaseExpandableListAdapter {

    Context context;
    List<String> concept;
    Map<String,List<String>> topics;

    public MyexListadapter(Context context, List<String> concept, Map<String, List<String>> topics) {
        this.context = context;
        this.concept = concept;
        this.topics = topics;
    }

    @Override
    public int getGroupCount() {
        return concept.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return topics.get(concept.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return concept.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return topics.get(concept.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String concept=(String)getGroup(groupPosition);

        if(convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_parent,null);
        }
        TextView txtParent=(TextView)convertView.findViewById(R.id.txtparent);
        txtParent.setText(concept);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String topic=(String)getChild(groupPosition,childPosition);

        if(convertView==null)
        {
            LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.list_child,null);
        }
        TextView txtchild=(TextView)convertView.findViewById(R.id.txtchild);
        txtchild.setText(topic);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
