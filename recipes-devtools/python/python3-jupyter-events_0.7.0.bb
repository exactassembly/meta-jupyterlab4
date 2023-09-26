
SUMMARY = "Jupyter Event System library"
HOMEPAGE = "http://jupyter.org/"
AUTHOR = " <Jupyter Development Team <jupyter@googlegroups.com>>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=469c300e985ff0b264c3ba21b4fae725"

#SRC_URI = "https://files.pythonhosted.org/packages/3f/0a/1c839290324ab93dc79950eaf26e198578db8b27edb587082b6061f4f9f5/jupyter_events-0.7.0.tar.gz"
#SRC_URI[md5sum] = "86f2a9eec0f577516efb3c637179b834"
SRC_URI[sha256sum] = "7be27f54b8388c03eefea123a4f79247c5b9381c49fb1cd48615ee191eb12615"

#S = "${WORKDIR}/jupyter_events-0.7.0"

PYPI_PACKAGE = "jupyter_events"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-jsonschema \
    ${PYTHON_PN}-jsonschema-specifications \
    ${PYTHON_PN}-python-json-logger \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-referencing \
    ${PYTHON_PN}-rfc3339-validator \
    ${PYTHON_PN}-rfc3986-validator \
    ${PYTHON_PN}-traitlets\
"

BBCLASSEXTEND = "native nativesdk"
