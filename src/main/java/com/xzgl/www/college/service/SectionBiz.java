package com.xzgl.www.college.service;

import com.xzgl.www.entity.Section;
import com.xzgl.www.entity.Staff;
import com.xzgl.www.entity.Timetable;
import com.xzgl.www.entity.custom.SectionCustom;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-12.
 */
public interface SectionBiz {
    public void delete(int sectionId);

    public void add(Section section);

    public List<SectionCustom> findAllCustom();

    public List<String> findAllCourseTitle();

    public List<Staff> findAllStaff();

    public void addTimetable(Timetable timetable);
}
